class FoodRatings {

    HashMap<String, String> f;
    HashMap<String,Integer> f2;
    HashMap<String, PriorityQueue<type>> c;
    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        f = new HashMap<> ();
        c = new HashMap<> ();
        f2 = new HashMap<> ();
        for(int i=0;i<foods.length;i++){
            f2.put(foods[i],ratings[i]);
            f.put(foods[i], cuisines[i]);
            PriorityQueue<type> temp = c.getOrDefault(cuisines[i], new PriorityQueue<type> ());
            temp.offer(new type(foods[i],ratings[i]));
            c.put(cuisines[i],temp);
        }
    }
    
    public void changeRating(String food, int newRating) {
        f2.put(food,newRating);
        String temp = f.get(food);
        PriorityQueue<type> t = c.get(temp);
        t.offer(new type(food, newRating));
        c.put(temp, t);
    }
    
    public String highestRated(String cuisine) {
        PriorityQueue<type> t = c.get(cuisine);
        type temp = t.peek();
        while(f2.get(temp.str) != temp.rating){
            t.poll();
            temp = t.peek();
        }
        return temp.str;
    }
}
class type implements Comparable<type>{
    String str;
    int rating;
    type(String str, int r){
        this.str = str;
        this.rating = r;
    }
    public int compareTo(type t){
        if(rating<t.rating){
            return 1;
        }
        else if(rating>t.rating){
            return -1;
        }
        else{
            return this.str.compareTo(t.str);
        }
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */