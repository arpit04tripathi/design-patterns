package com.a04t.dp.behavioral;

import com.a04t.dp.common.Node;

import static com.a04t.dp.common.constants.CommonConstants.DIVIDER;

public class Main {
    public static void main(String[] args) {
        System.out.println(DIVIDER);
        System.out.println("Hello world!");
        System.out.println(String.format("started %s", Main.class.getCanonicalName()));
        Node node = Node.builder().value(Main.class.getCanonicalName()).build();
        System.out.println(node);
        System.out.println(DIVIDER);
    }
}