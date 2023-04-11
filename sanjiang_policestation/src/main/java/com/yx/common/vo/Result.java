package com.yx.common.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.TestOnly;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @ClassName Result
 * @Description TODO
 * @Author zhouweijie
 * @Date 2023/4/3 09:32
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {
    private Integer code;
    private String message;
    private T data;

    public static<T> Result<T> success(){
        return new Result<>(20000,"success",null);
    }

    public static<T> Result<T> success(T data){
        return new Result<>(20000,"success",data);
    }

    public static<T> Result<T> success(String message,T data){
        return new Result<>(20000,message,data);
    }

    public static<T> Result<T> success(String message){
        return new Result<>(20000,message,null);
    }
    public static<T>  Result<T> fail(){
        return new Result<>(20001,"fail",null);
    }

    public static<T>  Result<T> fail(Integer code){
        return new Result<>(code,"fail",null);
    }

    public static<T>  Result<T> fail(Integer code, String message){
        return new Result<>(code,message,null);
    }

    public static<T>  Result<T> fail( String message){
        return new Result<>(20001,message,null);
    }

 }

