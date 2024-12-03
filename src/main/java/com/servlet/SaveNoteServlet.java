package com.servlet;

import com.entity.Note;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

public class SaveNoteServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public SaveNoteServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set the response content type
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        try {
            String title = req.getParameter("title");
            String content = req.getParameter("content");

            Note note = new Note(title, content, new Date());
            System.out.println(note.getNoteId() + " : " + note.getTitle());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}