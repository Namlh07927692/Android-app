package vn.edu.greenwich.cw_1_sample.models;

import java.io.Serializable;

public class Request implements Serializable {
    protected long _id;
    protected String _content;
    protected String _date;
    protected String _time;
    protected String _type;
    protected String _comments;
    protected long _residentId;

    public Request() {
        _id = -1;
        _content = null;
        _date = null;
        _time = null;
        _type = null;
        _comments = null;
        _residentId = -1;
    }

    public Request(long id, String content, String date, String time, String type, long residentId,String comments) {
        _id = id;
        _content = content;
        _comments = comments;
        _date = date;
        _time = time;
        _type = type;
        _residentId = residentId;
    }

    public long getId() {
        return _id;
    }

    public void setId(long id) {
        _id = id;
    }

    public String getContent() {
        return _content;
    }

    public void setContent(String content) {
        _content = content;
    }

    public String getDate() {
        return _date;
    }

    public void setDate(String date) {
        _date = date;
    }

    public String getTime() {
        return _time;
    }

    public void setTime(String time) {
        _time = time;
    }

    public String getType() {
        return _type;
    }

    public void setType(String type) {
        _type = type;
    }
    public String getComment() {
        return _comments;
    }

    public void setComment(String comments) {
        _comments = comments;
    }

    public long getResidentId() {
        return _residentId;
    }

    public void setResidentId(long residentId) {
        _residentId = residentId;
    }

    public boolean isEmpty() {
        if (-1 == _id &&null == _comments && null == _content && null == _date && null == _time && null == _type && -1 == _residentId)
            return true;

        return false;
    }

    @Override
    public String toString() {
        return "[" + _type + "][" + _date + "] " + _content + _content;
    }
}