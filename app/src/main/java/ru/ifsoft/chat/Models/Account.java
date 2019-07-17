
package ru.ifsoft.chat.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Account {

    @SerializedName("error")
    @Expose
    private Boolean error;
    @SerializedName("error_code")
    @Expose
    private Integer errorCode;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("gcm_regid")
    @Expose
    private Object gcmRegid;
    @SerializedName("ios_fcm_regid")
    @Expose
    private Object iosFcmRegid;
    @SerializedName("admob")
    @Expose
    private Object admob;
    @SerializedName("ghost")
    @Expose
    private String ghost;
    @SerializedName("ghost_create_at")
    @Expose
    private String ghostCreateAt;
    @SerializedName("vip")
    @Expose
    private String vip;
    @SerializedName("vip_create_at")
    @Expose
    private String vipCreateAt;
    @SerializedName("pro")
    @Expose
    private String pro;
    @SerializedName("pro_create_at")
    @Expose
    private String proCreateAt;
    @SerializedName("feeling")
    @Expose
    private String feeling;
    @SerializedName("gcm")
    @Expose
    private String gcm;
    @SerializedName("balance")
    @Expose
    private Object balance;
    @SerializedName("free_messages_count")
    @Expose
    private Object freeMessagesCount;
    @SerializedName("fb_id")
    @Expose
    private String fbId;
    @SerializedName("rating")
    @Expose
    private String rating;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("regtime")
    @Expose
    private String regtime;
    @SerializedName("ip_addr")
    @Expose
    private String ipAddr;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("fullname")
    @Expose
    private String fullname;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("fb_page")
    @Expose
    private String fbPage;
    @SerializedName("instagram_page")
    @Expose
    private String instagramPage;
    @SerializedName("verify")
    @Expose
    private String verify;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("emailVerify")
    @Expose
    private String emailVerify;
    @SerializedName("sex")
    @Expose
    private String sex;
    @SerializedName("sex_orientation")
    @Expose
    private String sexOrientation;
    @SerializedName("age")
    @Expose
    private String age;
    @SerializedName("height")
    @Expose
    private String height;
    @SerializedName("weight")
    @Expose
    private String weight;
    @SerializedName("year")
    @Expose
    private String year;
    @SerializedName("month")
    @Expose
    private String month;
    @SerializedName("day")
    @Expose
    private String day;
    @SerializedName("lat")
    @Expose
    private String lat;
    @SerializedName("lng")
    @Expose
    private String lng;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("lowPhotoUrl")
    @Expose
    private String lowPhotoUrl;
    @SerializedName("normalPhotoUrl")
    @Expose
    private String normalPhotoUrl;
    @SerializedName("bigPhotoUrl")
    @Expose
    private String bigPhotoUrl;
    @SerializedName("coverUrl")
    @Expose
    private String coverUrl;
    @SerializedName("originCoverUrl")
    @Expose
    private String originCoverUrl;
    @SerializedName("iStatus")
    @Expose
    private String iStatus;
    @SerializedName("iPoliticalViews")
    @Expose
    private String iPoliticalViews;
    @SerializedName("iWorldView")
    @Expose
    private String iWorldView;
    @SerializedName("iPersonalPriority")
    @Expose
    private String iPersonalPriority;
    @SerializedName("iImportantInOthers")
    @Expose
    private String iImportantInOthers;
    @SerializedName("iSmokingViews")
    @Expose
    private String iSmokingViews;
    @SerializedName("iAlcoholViews")
    @Expose
    private String iAlcoholViews;
    @SerializedName("iLooking")
    @Expose
    private String iLooking;
    @SerializedName("iInterested")
    @Expose
    private String iInterested;
    @SerializedName("allowShowMyInfo")
    @Expose
    private String allowShowMyInfo;
    @SerializedName("allowShowMyGallery")
    @Expose
    private String allowShowMyGallery;
    @SerializedName("allowShowMyFriends")
    @Expose
    private String allowShowMyFriends;
    @SerializedName("allowShowMyLikes")
    @Expose
    private String allowShowMyLikes;
    @SerializedName("allowShowMyGifts")
    @Expose
    private String allowShowMyGifts;
    @SerializedName("allowShowMyAge")
    @Expose
    private String allowShowMyAge;
    @SerializedName("allowShowMySexOrientation")
    @Expose
    private String allowShowMySexOrientation;
    @SerializedName("allowShowOnline")
    @Expose
    private String allowShowOnline;
    @SerializedName("allowPhotosComments")
    @Expose
    private String allowPhotosComments;
    @SerializedName("allowComments")
    @Expose
    private String allowComments;
    @SerializedName("allowMessages")
    @Expose
    private String allowMessages;
    @SerializedName("allowLikesGCM")
    @Expose
    private String allowLikesGCM;
    @SerializedName("allowMatchesGCM")
    @Expose
    private String allowMatchesGCM;
    @SerializedName("allowGiftsGCM")
    @Expose
    private String allowGiftsGCM;
    @SerializedName("allowCommentsGCM")
    @Expose
    private String allowCommentsGCM;
    @SerializedName("allowFollowersGCM")
    @Expose
    private String allowFollowersGCM;
    @SerializedName("allowMessagesGCM")
    @Expose
    private String allowMessagesGCM;
    @SerializedName("allowCommentReplyGCM")
    @Expose
    private String allowCommentReplyGCM;
    @SerializedName("lastAuthorize")
    @Expose
    private String lastAuthorize;
    @SerializedName("lastAuthorizeDate")
    @Expose
    private String lastAuthorizeDate;
    @SerializedName("lastAuthorizeTimeAgo")
    @Expose
    private String lastAuthorizeTimeAgo;
    @SerializedName("online")
    @Expose
    private Boolean online;
    @SerializedName("friendsCount")
    @Expose
    private String friendsCount;
    @SerializedName("photosCount")
    @Expose
    private String photosCount;
    @SerializedName("likesCount")
    @Expose
    private String likesCount;
    @SerializedName("matchesCount")
    @Expose
    private String matchesCount;
    @SerializedName("giftsCount")
    @Expose
    private String giftsCount;
    @SerializedName("notificationsCount")
    @Expose
    private String notificationsCount;
    @SerializedName("guestsCount")
    @Expose
    private String guestsCount;
    @SerializedName("newFriendsCount")
    @Expose
    private String newFriendsCount;
    @SerializedName("newMatchesCount")
    @Expose
    private String newMatchesCount;
    @SerializedName("messagesCount")
    @Expose
    private Integer messagesCount;

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getGcmRegid() {
        return gcmRegid;
    }

    public void setGcmRegid(Object gcmRegid) {
        this.gcmRegid = gcmRegid;
    }

    public Object getIosFcmRegid() {
        return iosFcmRegid;
    }

    public void setIosFcmRegid(Object iosFcmRegid) {
        this.iosFcmRegid = iosFcmRegid;
    }

    public Object getAdmob() {
        return admob;
    }

    public void setAdmob(Object admob) {
        this.admob = admob;
    }

    public String getGhost() {
        return ghost;
    }

    public void setGhost(String ghost) {
        this.ghost = ghost;
    }

    public String getGhostCreateAt() {
        return ghostCreateAt;
    }

    public void setGhostCreateAt(String ghostCreateAt) {
        this.ghostCreateAt = ghostCreateAt;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public String getVipCreateAt() {
        return vipCreateAt;
    }

    public void setVipCreateAt(String vipCreateAt) {
        this.vipCreateAt = vipCreateAt;
    }

    public String getPro() {
        return pro;
    }

    public void setPro(String pro) {
        this.pro = pro;
    }

    public String getProCreateAt() {
        return proCreateAt;
    }

    public void setProCreateAt(String proCreateAt) {
        this.proCreateAt = proCreateAt;
    }

    public String getFeeling() {
        return feeling;
    }

    public void setFeeling(String feeling) {
        this.feeling = feeling;
    }

    public String getGcm() {
        return gcm;
    }

    public void setGcm(String gcm) {
        this.gcm = gcm;
    }

    public Object getBalance() {
        return balance;
    }

    public void setBalance(Object balance) {
        this.balance = balance;
    }

    public Object getFreeMessagesCount() {
        return freeMessagesCount;
    }

    public void setFreeMessagesCount(Object freeMessagesCount) {
        this.freeMessagesCount = freeMessagesCount;
    }

    public String getFbId() {
        return fbId;
    }

    public void setFbId(String fbId) {
        this.fbId = fbId;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRegtime() {
        return regtime;
    }

    public void setRegtime(String regtime) {
        this.regtime = regtime;
    }

    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFbPage() {
        return fbPage;
    }

    public void setFbPage(String fbPage) {
        this.fbPage = fbPage;
    }

    public String getInstagramPage() {
        return instagramPage;
    }

    public void setInstagramPage(String instagramPage) {
        this.instagramPage = instagramPage;
    }

    public String getVerify() {
        return verify;
    }

    public void setVerify(String verify) {
        this.verify = verify;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailVerify() {
        return emailVerify;
    }

    public void setEmailVerify(String emailVerify) {
        this.emailVerify = emailVerify;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSexOrientation() {
        return sexOrientation;
    }

    public void setSexOrientation(String sexOrientation) {
        this.sexOrientation = sexOrientation;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLowPhotoUrl() {
        return lowPhotoUrl;
    }

    public void setLowPhotoUrl(String lowPhotoUrl) {
        this.lowPhotoUrl = lowPhotoUrl;
    }

    public String getNormalPhotoUrl() {
        return normalPhotoUrl;
    }

    public void setNormalPhotoUrl(String normalPhotoUrl) {
        this.normalPhotoUrl = normalPhotoUrl;
    }

    public String getBigPhotoUrl() {
        return bigPhotoUrl;
    }

    public void setBigPhotoUrl(String bigPhotoUrl) {
        this.bigPhotoUrl = bigPhotoUrl;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public String getOriginCoverUrl() {
        return originCoverUrl;
    }

    public void setOriginCoverUrl(String originCoverUrl) {
        this.originCoverUrl = originCoverUrl;
    }

    public String getIStatus() {
        return iStatus;
    }

    public void setIStatus(String iStatus) {
        this.iStatus = iStatus;
    }

    public String getIPoliticalViews() {
        return iPoliticalViews;
    }

    public void setIPoliticalViews(String iPoliticalViews) {
        this.iPoliticalViews = iPoliticalViews;
    }

    public String getIWorldView() {
        return iWorldView;
    }

    public void setIWorldView(String iWorldView) {
        this.iWorldView = iWorldView;
    }

    public String getIPersonalPriority() {
        return iPersonalPriority;
    }

    public void setIPersonalPriority(String iPersonalPriority) {
        this.iPersonalPriority = iPersonalPriority;
    }

    public String getIImportantInOthers() {
        return iImportantInOthers;
    }

    public void setIImportantInOthers(String iImportantInOthers) {
        this.iImportantInOthers = iImportantInOthers;
    }

    public String getISmokingViews() {
        return iSmokingViews;
    }

    public void setISmokingViews(String iSmokingViews) {
        this.iSmokingViews = iSmokingViews;
    }

    public String getIAlcoholViews() {
        return iAlcoholViews;
    }

    public void setIAlcoholViews(String iAlcoholViews) {
        this.iAlcoholViews = iAlcoholViews;
    }

    public String getILooking() {
        return iLooking;
    }

    public void setILooking(String iLooking) {
        this.iLooking = iLooking;
    }

    public String getIInterested() {
        return iInterested;
    }

    public void setIInterested(String iInterested) {
        this.iInterested = iInterested;
    }

    public String getAllowShowMyInfo() {
        return allowShowMyInfo;
    }

    public void setAllowShowMyInfo(String allowShowMyInfo) {
        this.allowShowMyInfo = allowShowMyInfo;
    }

    public String getAllowShowMyGallery() {
        return allowShowMyGallery;
    }

    public void setAllowShowMyGallery(String allowShowMyGallery) {
        this.allowShowMyGallery = allowShowMyGallery;
    }

    public String getAllowShowMyFriends() {
        return allowShowMyFriends;
    }

    public void setAllowShowMyFriends(String allowShowMyFriends) {
        this.allowShowMyFriends = allowShowMyFriends;
    }

    public String getAllowShowMyLikes() {
        return allowShowMyLikes;
    }

    public void setAllowShowMyLikes(String allowShowMyLikes) {
        this.allowShowMyLikes = allowShowMyLikes;
    }

    public String getAllowShowMyGifts() {
        return allowShowMyGifts;
    }

    public void setAllowShowMyGifts(String allowShowMyGifts) {
        this.allowShowMyGifts = allowShowMyGifts;
    }

    public String getAllowShowMyAge() {
        return allowShowMyAge;
    }

    public void setAllowShowMyAge(String allowShowMyAge) {
        this.allowShowMyAge = allowShowMyAge;
    }

    public String getAllowShowMySexOrientation() {
        return allowShowMySexOrientation;
    }

    public void setAllowShowMySexOrientation(String allowShowMySexOrientation) {
        this.allowShowMySexOrientation = allowShowMySexOrientation;
    }

    public String getAllowShowOnline() {
        return allowShowOnline;
    }

    public void setAllowShowOnline(String allowShowOnline) {
        this.allowShowOnline = allowShowOnline;
    }

    public String getAllowPhotosComments() {
        return allowPhotosComments;
    }

    public void setAllowPhotosComments(String allowPhotosComments) {
        this.allowPhotosComments = allowPhotosComments;
    }

    public String getAllowComments() {
        return allowComments;
    }

    public void setAllowComments(String allowComments) {
        this.allowComments = allowComments;
    }

    public String getAllowMessages() {
        return allowMessages;
    }

    public void setAllowMessages(String allowMessages) {
        this.allowMessages = allowMessages;
    }

    public String getAllowLikesGCM() {
        return allowLikesGCM;
    }

    public void setAllowLikesGCM(String allowLikesGCM) {
        this.allowLikesGCM = allowLikesGCM;
    }

    public String getAllowMatchesGCM() {
        return allowMatchesGCM;
    }

    public void setAllowMatchesGCM(String allowMatchesGCM) {
        this.allowMatchesGCM = allowMatchesGCM;
    }

    public String getAllowGiftsGCM() {
        return allowGiftsGCM;
    }

    public void setAllowGiftsGCM(String allowGiftsGCM) {
        this.allowGiftsGCM = allowGiftsGCM;
    }

    public String getAllowCommentsGCM() {
        return allowCommentsGCM;
    }

    public void setAllowCommentsGCM(String allowCommentsGCM) {
        this.allowCommentsGCM = allowCommentsGCM;
    }

    public String getAllowFollowersGCM() {
        return allowFollowersGCM;
    }

    public void setAllowFollowersGCM(String allowFollowersGCM) {
        this.allowFollowersGCM = allowFollowersGCM;
    }

    public String getAllowMessagesGCM() {
        return allowMessagesGCM;
    }

    public void setAllowMessagesGCM(String allowMessagesGCM) {
        this.allowMessagesGCM = allowMessagesGCM;
    }

    public String getAllowCommentReplyGCM() {
        return allowCommentReplyGCM;
    }

    public void setAllowCommentReplyGCM(String allowCommentReplyGCM) {
        this.allowCommentReplyGCM = allowCommentReplyGCM;
    }

    public String getLastAuthorize() {
        return lastAuthorize;
    }

    public void setLastAuthorize(String lastAuthorize) {
        this.lastAuthorize = lastAuthorize;
    }

    public String getLastAuthorizeDate() {
        return lastAuthorizeDate;
    }

    public void setLastAuthorizeDate(String lastAuthorizeDate) {
        this.lastAuthorizeDate = lastAuthorizeDate;
    }

    public String getLastAuthorizeTimeAgo() {
        return lastAuthorizeTimeAgo;
    }

    public void setLastAuthorizeTimeAgo(String lastAuthorizeTimeAgo) {
        this.lastAuthorizeTimeAgo = lastAuthorizeTimeAgo;
    }

    public Boolean getOnline() {
        return online;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }

    public String getFriendsCount() {
        return friendsCount;
    }

    public void setFriendsCount(String friendsCount) {
        this.friendsCount = friendsCount;
    }

    public String getPhotosCount() {
        return photosCount;
    }

    public void setPhotosCount(String photosCount) {
        this.photosCount = photosCount;
    }

    public String getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(String likesCount) {
        this.likesCount = likesCount;
    }

    public String getMatchesCount() {
        return matchesCount;
    }

    public void setMatchesCount(String matchesCount) {
        this.matchesCount = matchesCount;
    }

    public String getGiftsCount() {
        return giftsCount;
    }

    public void setGiftsCount(String giftsCount) {
        this.giftsCount = giftsCount;
    }

    public String getNotificationsCount() {
        return notificationsCount;
    }

    public void setNotificationsCount(String notificationsCount) {
        this.notificationsCount = notificationsCount;
    }

    public String getGuestsCount() {
        return guestsCount;
    }

    public void setGuestsCount(String guestsCount) {
        this.guestsCount = guestsCount;
    }

    public String getNewFriendsCount() {
        return newFriendsCount;
    }

    public void setNewFriendsCount(String newFriendsCount) {
        this.newFriendsCount = newFriendsCount;
    }

    public String getNewMatchesCount() {
        return newMatchesCount;
    }

    public void setNewMatchesCount(String newMatchesCount) {
        this.newMatchesCount = newMatchesCount;
    }

    public Integer getMessagesCount() {
        return messagesCount;
    }

    public void setMessagesCount(Integer messagesCount) {
        this.messagesCount = messagesCount;
    }

}
