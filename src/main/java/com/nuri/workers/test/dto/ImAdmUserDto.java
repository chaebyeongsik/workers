package com.nuri.workers.test.dto;

import com.nuri.workers.test.entity.ImAdmUser;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ImAdmUserDto {
    
    private Long admuserIdx;
    private String admuserid;
    private String admusername;
    private String admuseremail;
    private String admuserdesc;
    private Long admgrpIdx;
    private String passwd;
    private int isGrpadmin;
    private int sendauth;
    private int creategrpauth;
    private int createcontentauth;
    private int monlevel;
    private int readNtc;
    private int beSearched;
    private String userLang;
    private int emailEncryption;
    
    public ImAdmUser toEntity(){
        return ImAdmUser.builder()
            .admgrpIdx(this.admgrpIdx)
            .admuserid(this.admuserid)
            .admusername(this.admusername)
            .admuseremail(this.admuseremail)
            .admuserdesc(this.admuserdesc)
            .admgrpIdx(this.admgrpIdx)
            .passwd(this.passwd)
            .isGrpadmin(this.isGrpadmin)
            .sendauth(this.sendauth)
            .creategrpauth(this.creategrpauth)
            .createcontentauth(this.createcontentauth)
            .monlevel(this.monlevel)
            .readNtc(this.readNtc)
            .beSearched(this.beSearched)
            .userLang(this.userLang)
            .emailEncryption(this.emailEncryption)
            .build();
    }

}
