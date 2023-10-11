class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        TreeMap<Integer, Integer> bloomMap = new TreeMap<>();
        int[] result = new int[people.length];
        int totalBloom = 0;
        
        for (int[] flower : flowers) {
            int start = flower[0];
            int end = flower[1];
            bloomMap.put(start, bloomMap.getOrDefault(start, 0) + 1);
            bloomMap.put(end + 1, bloomMap.getOrDefault(end + 1, 0) - 1);
        }
        
        for (int time : bloomMap.keySet()) {
            totalBloom += bloomMap.get(time);
            bloomMap.put(time, totalBloom);
        }
        
        for (int i = 0; i < people.length; i++) {
            int arrivalTime = people[i];
            Integer prevTime = bloomMap.floorKey(arrivalTime);
            result[i] = (prevTime == null) ? 0 : bloomMap.get(prevTime);
        }
        
        return result;
    }
}