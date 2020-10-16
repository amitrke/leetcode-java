import java.util.PriorityQueue;

class KthLargest {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int n:nums){
            minHeap.add(n);
            if (minHeap.size() > k){
                minHeap.remove();
            }
        }
        return minHeap.remove();
    }

    public static void main(String args[]) {
        KthLargest kth = new KthLargest();
        int[] nums = {2,5,9,1,3,9,3};
        int result = kth.findKthLargest(nums, 2);
        System.out.println(result);
    }
}