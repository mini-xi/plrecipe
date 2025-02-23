package com.sixcandoit.plrecipe_place.command.dto;

public class PlaceStarDTO {

    private int starId;
    private int starPoint;
    private String starComment;
    private int placeId;
    private int memberId;

    public PlaceStarDTO() {
    }

    public PlaceStarDTO(int starPoint, String starComment, int placeId, int memberId) {
        this.starPoint = starPoint;
        this.starComment = starComment;
        this.placeId = placeId;
        this.memberId = memberId;
    }

    public PlaceStarDTO(int starId, int starPoint, String starComment, int placeId, int memberId) {
        this.starId = starId;
        this.starPoint = starPoint;
        this.starComment = starComment;
        this.placeId = placeId;
        this.memberId = memberId;
    }

    public int getStarId() {
        return starId;
    }

    public void setStarId(int starId) {
        this.starId = starId;
    }

    public int getStarPoint() {
        return starPoint;
    }

    public void setStarPoint(int starPoint) {
        this.starPoint = starPoint;
    }

    public String getStarComment() {
        return starComment;
    }

    public void setStarComment(String starComment) {
        this.starComment = starComment;
    }

    public int getPlaceId() {
        return placeId;
    }

    public void setPlaceId(int placeId) {
        this.placeId = placeId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return "PlaceStarDTO{" +
                "starId=" + starId +
                ", starPoint=" + starPoint +
                ", starComment='" + starComment + '\'' +
                ", placeId=" + placeId +
                ", memberId=" + memberId +
                '}';
    }
}
