class ProductOfNumbers {
    ArrayList<Integer> al;
    public ProductOfNumbers() {
        al = new ArrayList<>();
    }
    
    public void add(int num) {
        al.add(num);
    }
    
    public int getProduct(int k) {
        int bound = al.size()-k;
        int prod = 1;
        while(bound < al.size()){
            int x = al.get(bound);
            prod *= x;
            bound++;
        
        }
        return prod;   
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */