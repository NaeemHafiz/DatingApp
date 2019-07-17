
package ru.ifsoft.chat.Models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("error")
    @Expose
    private Boolean error;
    @SerializedName("error_code")
    @Expose
    private Integer errorCode;
    @SerializedName("accessToken")
    @Expose
    private String accessToken;
    @SerializedName("accountId")
    @Expose
    private String accountId;
    @SerializedName("account")
    @Expose
    private List<Account> account = null;

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

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public List<Account> getAccount() {
        return account;
    }

    public void setAccount(List<Account> account) {
        this.account = account;
    }

}
