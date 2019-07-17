package ru.ifsoft.chat.Remote;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import ru.ifsoft.chat.Models.User;

public interface ApiInterface {

    @FormUrlEncoded
    @POST("user/register")
    Call<User> signUp(@Field("clientId") String clientId,
                      @Field("email") String email, @Field("password") String password,
                      @Field("username") String cpassword,
                        @Field("fullname") String fullname);


}
