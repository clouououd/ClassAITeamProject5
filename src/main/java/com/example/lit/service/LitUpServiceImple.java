package com.example.lit.service;

import com.example.lit.domain.dao.review.*;
import com.example.lit.domain.vo.Criteria;
import com.example.lit.domain.vo.review.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LitUpServiceImple implements LitUpService{
    private final LikeDAO likeDAO;
    private final ReplyDAO replyDAO;
    private final ReportDAO reportDAO;
    private final ReviewDAO reviewDAO;
    private final ReviewFileDAO reviewFileDAO;

    @Override
    public void registerLike(LikeVO likeVO) {

    }

    @Override
    public void removeLike(LikeVO likeVO) {

    }

    @Override
    public void registerReply(ReplyVO replyVO) {

    }

    @Override
    public boolean removeReply(Long replyNumber) {
        return false;
    }

    @Override
    public boolean modifyReply(ReplyVO replyVO) {
        return false;
    }

    @Override
    public List<ReplyVO> getReplyList(Criteria criteria, Long reviewNumber) {
        return null;
    }

    @Override
    public int getTotalReply(Long reviewNumber) {
        return 0;
    }

    @Override
    public void registerReport(ReportVO reportVO) {

    }

    @Override
    public void removeReport(Long reportNumber) {

    }

    @Override
    public List<ReviewVO> getList(Criteria criteria) {
        return null;
    }

    @Override
    public void register(ReviewVO reviewVO) {

    }

    @Override
    public ReviewVO read(Long reviewNumber) {
        return null;
    }

    @Override
    public boolean remove(Long reviewNumber) {
        return false;
    }

    @Override
    public boolean modify(ReviewVO reviewVO) {
        return false;
    }

    @Override
    public int getTotal() {
        return 0;
    }

    @Override
    public int resultCount() {
        return 0;
    }

    @Override
    public void registerImg(ReviewFileVO reviewFileVO) {

    }

    @Override
    public void removeImg(Long reviewNumber) {

    }

    @Override
    public void modifyImg(ReviewFileVO reviewFileVO) {

    }

    @Override
    public List<ReviewFileVO> getImgs(Long reviewNumber) {
        return null;
    }

    @Override
    public List<ReviewFileVO> getOldFiles() {
        return null;
    }
}