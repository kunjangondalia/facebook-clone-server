package com.KunjanGondalia.facebookclone.model;

import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    private String id;
    private String post;
    private String name;
    private String email;
    private String image;
    private String profilePic;
    private String timeStamp;
    private String imageName;
    private String file;
}
