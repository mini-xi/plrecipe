package com.sixcandoit.plrecipe_group.feature.group.vo;

import com.sixcandoit.plrecipe_group.feature.group.aggregate.GroupEntity;
import com.sixcandoit.plrecipe_group.feature.group.dto.MemberGrade;
import jakarta.persistence.*;

@Entity(name = "plrecipe_member")
@Table(name = "member_info")
public class Member {

    @Id
    @Column(name = "member_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int memberId;

    @Column(name = "member_email")
    private String memberEmail;

    @Column(name = "password")
    private String password;

    @Column(name = "member_name")
    private String memberName;

    @Column(name = "member_nickname")
    private String memberNickname;

    @Column(name = "member_number")
    private String memberNumber;

    @Column(name = "join_date")
    private String joinDate;

    @Column(name = "withdrawal_date")
    private String withdrawalDate;

    @Column(name = "member_grade")
    @Enumerated(EnumType.STRING)
    private MemberGrade memberGrade;

    @Column(name = "member_status")
    private String memberStatus;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "group_id")
//    private GroupEntity group;

    public Member() {
    }

    public Member(int memberid, String memberEmail, String password, String memberName, String memberNickname, String memberNumber, String joinDate, String withdrawalDate, MemberGrade memberGrade, String memberStatus) {
        this.memberId = memberId;
        this.memberEmail = memberEmail;
        this.password = password;
        this.memberName = memberName;
        this.memberNickname = memberNickname;
        this.memberNumber = memberNumber;
        this.joinDate = joinDate;
        this.withdrawalDate = withdrawalDate;
        this.memberGrade = memberGrade;
        this.memberStatus = memberStatus;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberNickname() {
        return memberNickname;
    }

    public void setMemberNickname(String memberNickname) {
        this.memberNickname = memberNickname;
    }

    public String getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(String memberNumber) {
        this.memberNumber = memberNumber;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public String getWithdrawalDate() {
        return withdrawalDate;
    }

    public void setWithdrawalDate(String withdrawalDate) {
        this.withdrawalDate = withdrawalDate;
    }

    public MemberGrade getMemberGrade() {
        return memberGrade;
    }

    public void setMemberGrade(MemberGrade memberGrade) {
        this.memberGrade = memberGrade;
    }

    public String getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(String memberStatus) {
        this.memberStatus = memberStatus;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId='" + memberId + '\'' +
                ", memberEmail='" + memberEmail + '\'' +
                ", password='" + password + '\'' +
                ", memberName='" + memberName + '\'' +
                ", memberNickname='" + memberNickname + '\'' +
                ", memberNumber='" + memberNumber + '\'' +
                ", joinDate='" + joinDate + '\'' +
                ", withdrawalDate='" + withdrawalDate + '\'' +
                ", memberGrade=" + memberGrade +
                ", memberStatus='" + memberStatus + '\'' +
                '}';
    }
}