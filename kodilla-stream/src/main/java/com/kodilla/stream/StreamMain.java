package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculate expressions with lambdas");
        expressionExecutor.executeExpression(10,5,(a,b) -> a + b);
        expressionExecutor.executeExpression(10,5,(a,b) -> a - b);
        expressionExecutor.executeExpression(10,5,(a,b) -> a * b);
        expressionExecutor.executeExpression(10,5,(a,b) -> a / b);

        System.out.println("Calculate expressions with method references");
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::divideAByB);


        System.out.println("Decorate Texts: ");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("TestTextToDecorate", (xd) -> "ABC"+xd+"ABC");
        poemBeautifier.beautify("TestTextToDecorate", (xd) ->  xd.toUpperCase());
        poemBeautifier.beautify("TestTextToDecorate", (xd) ->  xd.replace('T','D'));
        poemBeautifier.beautify("TestTextToDecorate", (xd) ->  xd.toLowerCase());


    }
}
