package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {

    private int quantityUsers;
    private int quantityPosts;
    private int quantityComments;
    private double avgPostsOnUser;
    private double avgCommentsOnUser;
    private double avgCommentsOnPost;

    private Statistics statistics;

     /*public CalculateStatistics(Statistics statistics) {
        this.statistics = statistics;
    }*/

    public void calculateAdvStatistics(Statistics statistics){
        if (statistics.usersNames().isEmpty()){
            quantityUsers = 0;
        }else {
            quantityUsers = statistics.usersNames().size();
        }
        quantityPosts = statistics.postsCount();
        quantityComments = statistics.commentsCount();
            if (quantityUsers != 0) {
                avgPostsOnUser = quantityPosts/ quantityUsers;
                avgCommentsOnUser = quantityComments / quantityUsers;
            }else {
                avgPostsOnUser = quantityPosts / 1;
                avgCommentsOnUser = quantityComments / 1;
            }
            if (quantityPosts != 0) {
                avgCommentsOnPost = quantityComments / quantityPosts;
            }else {
                avgCommentsOnPost = quantityComments / 1;
            }
      //  }
    }

    public void showStatistics(){
        System.out.println("Quantity users: "+quantityUsers);
        System.out.println("Quantity posts: "+quantityPosts);
        System.out.println("Quantity comments: "+quantityComments);
        System.out.println("Avarage posts on user: "+avgPostsOnUser);
        System.out.println("Avarage comments on user: "+avgCommentsOnUser);
        System.out.println("Avarage comments on post: "+avgCommentsOnPost);
    }

    public int getQuantityUsers() {
        return quantityUsers;
    }

    public int getQuantityPosts() {
        return quantityPosts;
    }

    public int getQuantityComments() {
        return quantityComments;
    }

    public double getAvgPostsOnUser() {
        return avgPostsOnUser;
    }

    public double getAvgCommentsOnUser() {
        return avgCommentsOnUser;
    }

    public double getAvgCommentsOnPost() {
        return avgCommentsOnPost;
    }
}
