class Demo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("a");
        al.add("b");
        al.add("c");
        al.add("d");
        al.add("e");

        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i));

        }

        al.set(2, "z");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

    }
}
