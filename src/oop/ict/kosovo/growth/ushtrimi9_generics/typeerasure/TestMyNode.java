package oop.ict.kosovo.growth.ushtrimi9_generics.typeerasure;

public class TestMyNode {
    public static void main(String[] args) {
        MyNode node1 = new MyNode(100);
        node1.setData(200);

        System.out.println(node1.getData());
        System.out.println(totalIntArguments(1));
        System.out.println(totalIntArguments(1,2));
        System.out.println(totalIntArguments(1,2,3,5,6,4,123,123,13,123,131,23,1243,13,123,213,123,13,123,123,12,41,3141,51,431,2312,31,231,312,4312,31,312,3));

    }

    public static int totalIntArguments(int... numrat) {
        return numrat.length;
    }

    public static int totalMyNodesArguments(MyNode... myNodes) {
        return myNodes.length;
    }
}
