public class ReviewDriver {
    public static void main(String []arg){
        //System.out.println( Review.sentimentVal("actress"));
        //System.out.println( Review.sentimentVal("enjoy"));
        //System.out.println( Review.sentimentVal("nice"));
        System.out.println(Review.totalSentiment("SimpleReview.txt"));
        System.out.println(Review.starRating("SimpleReview.txt"));
    }


}
