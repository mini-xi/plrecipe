package com.sixcandoit.plrecipe_group.feature.group.dto;

import com.sixcandoit.plrecipe_group.feature.group.vo.ResponseMember;

import java.util.List;

public class GroupDTO {

    private int groupId;
    private String groupName;
    private String isGroupPublic;
    private String groupCreateDate;
    private String groupWithdrawalDate;
    private String groupComment;
    private String groupStatus;


//    public ResponseMember getMember() {
//        return member;
//    }

//    public void setMember(ResponseMember member) {
//        this.member = member;
//    }

//    private ResponseMember member;
//
//    private List<MemberDTO> members; // 기본 정보
//    private List<ResponseMember> additionalInfo;

    public GroupDTO() {
    }

    public GroupDTO(int groupId, String groupName, String isGroupPublic, String groupCreateDate, String groupWithdrawalDate, String groupComment, String groupStatus) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.isGroupPublic = isGroupPublic;
        this.groupCreateDate = groupCreateDate;
        this.groupWithdrawalDate = groupWithdrawalDate;
        this.groupComment = groupComment;
        this.groupStatus = groupStatus;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getIsGroupPublic() {
        return isGroupPublic;
    }

    public void setIsGroupPublic(String isGroupPublic) {
        this.isGroupPublic = isGroupPublic;
    }

    public String getGroupCreateDate() {
        return groupCreateDate;
    }

    public void setGroupCreateDate(String groupCreateDate) {
        this.groupCreateDate = groupCreateDate;
    }

    public String getGroupWithdrawalDate() {
        return groupWithdrawalDate;
    }

    public void setGroupWithdrawalDate(String groupWithdrawalDate) {
        this.groupWithdrawalDate = groupWithdrawalDate;
    }

    public String getGroupComment() {
        return groupComment;
    }

    public void setGroupComment(String groupComment) {
        this.groupComment = groupComment;
    }

    public String getGroupStatus() {
        return groupStatus;
    }

    public void setGroupStatus(String groupStatus) {
        this.groupStatus = groupStatus;
    }

    @Override
    public String toString() {
        return "GroupDTO{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                ", isGroupPublic='" + isGroupPublic + '\'' +
                ", groupCreateDate='" + groupCreateDate + '\'' +
                ", groupWithdrawalDate='" + groupWithdrawalDate + '\'' +
                ", groupComment='" + groupComment + '\'' +
                ", groupStatus='" + groupStatus + '\'' +
                '}';
    }
}