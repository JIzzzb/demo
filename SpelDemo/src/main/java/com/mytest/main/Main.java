package com.mytest.main;

import com.mytest.dao.Inventor;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.*;

public class Main {

    static class Simple {
        public List<Boolean> booleanList = new ArrayList<>();
    }

    public static void main(String[] args) {


    }

    public static String Turn(String value) {
        if ("Nikola Tesla".equals(value)) {
            return "1";
        }
        return "0";
    }
}
