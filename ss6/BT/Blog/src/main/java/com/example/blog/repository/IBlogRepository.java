package com.example.blog.repository;


import com.example.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface IBlogRepository extends JpaRepository<Blog,String> {
    Blog findBlogByTitle(String title);
    Blog findBlogByCodeBlog(String codeBlog);

    Page<Blog> findAllByTitleLike(Pageable pageable,String title);
    Page<Blog> findAllByAuthorLike(Pageable pageable,String author);

    void deleteByCodeBlog(String codeBlog);


}