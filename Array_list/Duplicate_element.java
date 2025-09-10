class Geeks {
    // print the elements which appear more than
    // once in the array in sorted order
    public static void SortedDuplicates(int arr[], int n) {
        // Your code here
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);

        }
        List<Integer> du = new ArrayList<>();
        for (Map.Entry<Integer, Integer> key : map.entrySet()) {
            if (key.getValue() >= 2) {
                du.add(key.getKey());
            }
        }

        if (du.isEmpty()) {
            System.out.print(-1);
        } else {

            for (int num : du) {

                System.out.print(num + " ");
            }

        }
    }
}
