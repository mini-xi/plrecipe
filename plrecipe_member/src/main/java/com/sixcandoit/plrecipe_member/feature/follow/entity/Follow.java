package com.sixcandoit.plrecipe_member.feature.follow.entity;

public class Follow {


    private int followId;
    private String userFollow;
    private String userFollower;

    public Follow() {
    }

    public Follow(int followId, String userFollow, String userFollower) {
        this.followId = followId;
        this.userFollow = userFollow;
        this.userFollower = userFollower;
    }

    public int getFollowId() {
        return followId;
    }

    public void setFollowId(int followId) {
        this.followId = followId;
    }

    public String getUserFollow() {
        return userFollow;
    }

    public void setUserFollow(String userFollow) {
        this.userFollow = userFollow;
    }

    public String getUserFollower() {
        return userFollower;
    }

    public void setUserFollower(String userFollower) {
        this.userFollower = userFollower;
    }

    @Override
    public String toString() {
        return "Follow{" +
                "followId=" + followId +
                ", userFollow='" + userFollow + '\'' +
                ", userFollower='" + userFollower + '\'' +
                '}';
    }
}
