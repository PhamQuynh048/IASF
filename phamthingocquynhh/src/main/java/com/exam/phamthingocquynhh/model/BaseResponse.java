package com.exam.phamthingocquynhh.model;

public class BaseResponse<E> {
    public int status = 1;
    public String message = "success";
    public E data;
}
