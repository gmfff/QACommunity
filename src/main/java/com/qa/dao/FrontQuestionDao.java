package com.qa.dao;

import com.qa.entity.QaComment; /**
 * Created by InterlliJ IDEA.
 * User:3to
 * Date:18-1-2
 * Time:下午9:36
 */
public interface FrontQuestionDao {
    Object getQuestionById(int id);

    Object getCommentById(int id);

    boolean addReply(QaComment qaComment);
}
