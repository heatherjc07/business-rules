grammar RuleSetGrammar;

/* name must match up with grammar at top of the file */

/* Lexical rules */

IF   : 'if' ;
THEN : 'then';

AND : 'and' ;
OR  : 'or' ;

TRUE  : 'true' ;
FALSE : 'false' ;

// DECIMAL, IDENTIFIER, COMMENTS, WS are set using regular expressions

DECIMAL : '-'?[0-9]+('.'[0-9]+)? ;

IDENTIFIER : [a-zA-Z_][a-zA-Z_0-9]* ;

NEWLINE : '\r'? '\n';

// COMMENT and WS are stripped from the output token stream by sending
// to a different channel 'skip'

COMMENT : '//' .+? ('\n'|EOF) -> skip ;

WS : [ \r\t\u000C\n]+ -> skip ;

/* Grammar rules */

rule_set : single_rule* EOF ;

single_rule : logical_expr NEWLINE ;

logical_expr
 : logical_expr AND logical_expr # LogicalExpressionAnd
 | logical_expr OR logical_expr  # LogicalExpressionOr
 | specification_expr            # SpecificationExpression
 ;

specification_expr : specification <assoc=right> specification_operand
                    # SpecificationExpressionWithOperator
                ;

specification: area_greater_than
               | includes_option;

specification_operand : numeric_entity
                                  ;

area_greater_than : 'application area greater than' ;

includes_option : 'application includes option' ;

numeric_entity : DECIMAL              # NumericConst
               | IDENTIFIER           # NumericVariable
               ;
