/*
 * This file is generated by jOOQ.
 */
package com.example.demo.genetate;


import com.example.demo.genetate.tables.Comments;
import com.example.demo.genetate.tables.Posts;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in PUBLIC
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>PUBLIC.COMMENTS</code>.
     */
    public static final Comments COMMENTS = com.example.demo.genetate.tables.Comments.COMMENTS;

    /**
     * The table <code>PUBLIC.POSTS</code>.
     */
    public static final Posts POSTS = com.example.demo.genetate.tables.Posts.POSTS;
}
