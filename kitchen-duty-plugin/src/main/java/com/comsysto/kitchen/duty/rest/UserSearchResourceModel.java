//package com.comsysto.kitchen.duty.rest;
//
//import javax.xml.bind.annotation.*;
//@XmlRootElement(name = "message")
//@XmlAccessorType(XmlAccessType.FIELD)
//public class UserSearchResourceModel {
//
//    @XmlElement(name = "value")
//    private String message;
//
//    public UserSearchResourceModel() {
//    }
//
//    public UserSearchResourceModel(String message) {
//        this.message = message;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//}

package com.comsysto.kitchen.duty.rest;

import javax.xml.bind.annotation.*;
@XmlRootElement(name = "users")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserSearchResourceModel {

    @XmlElement
    private String text;

    @XmlElement
    private String id;

    public UserSearchResourceModel() {
    }

    public UserSearchResourceModel(String text, String id) {
        this.text = text;
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}