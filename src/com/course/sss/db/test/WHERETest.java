package com.course.sss.db.test;

import com.course.sss.db.data.query.WHEREParser;

public class WHERETest {
    public static final String VALID_STRING="WHERE id=5";
    public static final String VALID_STRING2="    WHERE id=2    AND name=Tony  ";
    public static final String INVALID_STRING="Bad Where";
    public static final String INVALID_STRING2="Bad Where xxxxxxxxxxxxxx";

    static WHEREParser parser=new WHEREParser();

    @Test(enabled=true)
    public static void testValidString(){
        assert parser.validate(VALID_STRING): VALID_STRING;
    }

    @Test
    public static void testInvalidString(){
        assert !parser.validate(INVALID_STRING): INVALID_STRING;
    }
    public static void notTest(){

    }
    @Test
    public static void testBeautify (){
        assert parser.beautify(VALID_STRING2).equals("WHERE id = AND name = Tony");
    }
    @Test
    public static void testExtractClause(){
        assert parser.extructClause(VALID_STRING).equals(" id = 5");
        assert parser.extructClause(VALID_STRING2).equals("    id=2    AND name=Tony  ");
    }
}
