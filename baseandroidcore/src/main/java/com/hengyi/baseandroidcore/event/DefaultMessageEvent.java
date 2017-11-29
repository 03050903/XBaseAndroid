package com.hengyi.baseandroidcore.event;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by fanhua on 17-11-18.
 */

public class DefaultMessageEvent implements Serializable{
    private Object obj;
    private int code;
    private int status;
    private String content;
    private Map<String,Object> map;

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
}
