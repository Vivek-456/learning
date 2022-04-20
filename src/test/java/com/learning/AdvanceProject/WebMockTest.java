package com.learning.AdvanceProject;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.hamcrest.Matchers.containsString;

import static org.mockito.Mockito.when;
import static org.springframework.test.util.AssertionErrors.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.learning.AdvanceProject.controller.SimpleBookController;
import com.learning.AdvanceProject.model.Book;
import com.learning.AdvanceProject.repositories.BookRepository;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


@WebMvcTest(SimpleBookController.class)
public class WebMockTest {


        @Autowired
        private MockMvc mockMvc;

        @MockBean
        private BookRepository bookRepository;

        @Test
        public void greetingShouldReturnMessageFromService () throws Exception {
            Book one = new Book();
            Book two = new Book();
            Book three = new Book();
            Book four = new Book();
            List<Book> bookList = new ArrayList<Book>();
            bookList.add(one);
            bookList.add(two);
            bookList.add(three);
            bookList.add(four);

        when(bookRepository.findAll()).thenReturn(bookList);
        this.mockMvc.perform(get("/books-rest/all")).andDo(print()).andExpect(status().isOk());
            List<Book> books = new ArrayList<Book>();
            Iterator<Book> iterator = bookRepository.findAll().iterator();
            while (iterator.hasNext()) {
                books.add(iterator.next());
            }

            assertThat(books.size()).isEqualTo(4);
    }
    }

