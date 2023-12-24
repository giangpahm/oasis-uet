package Cau2;

class SortingContext {
    private SortingStrategy strategy;

    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Pham Huong Giang - 22024572.
     */
    public void performSort(int[] arr) {
        if (strategy != null) {
            strategy.sort(arr);
        } else {
            System.out.println("Lỗi");
        }
    }
}

