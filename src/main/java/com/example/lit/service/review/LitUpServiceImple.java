package com.example.lit.service.review;

import com.example.lit.domain.dao.review.*;
import com.example.lit.domain.vo.Criteria;
import com.example.lit.domain.vo.SearchDTO;
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
        likeDAO.register(likeVO);
    }

    @Override
    public void removeLike(LikeVO likeVO) {
        likeDAO.remove(likeVO);
    }

    @Override
    public Long getLikeTotal(Long reviewNumber) {
        return likeDAO.getTotal(reviewNumber);
    }

    @Override
    public int getCheckLike(Long userNumber) {
        return likeDAO.checkLike(userNumber);
    }

    @Override
    public void registerReply(ReplyVO replyVO) {
        replyDAO.register(replyVO);
    }

    @Override
    public boolean removeReply(ReplyVO replyVO) {

        return replyDAO.remove(replyVO);
    }

    @Override
    public boolean modifyReply(ReplyVO replyVO) {
        return false;
    }

    @Override
    public List<ReplyVO> getReplyList(Criteria criteria, Long reviewNumber) {
        return replyDAO.getList(criteria, reviewNumber);
    }

    @Override
    public int getTotalReply(Long reviewNumber) {
        return replyDAO.getTotal(reviewNumber);
    }

    @Override
    public void registerReport(ReportVO reportVO) {
        reportDAO.register(reportVO);
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
        return reviewDAO.read(reviewNumber);
    }

    @Override
    public boolean remove(Long reviewNumber) {
        return reviewDAO.remove(reviewNumber);
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

    @Override
    public List<ReviewDTO> searchReview(SearchDTO searchDTO) {
        return reviewDAO.searchReview(searchDTO);
    }

    @Override
    public List<ReportDTO> searchReport(SearchDTO searchDTO) {
        return reportDAO.searchReport(searchDTO);
    }

    @Override
    public void removeReport(Long reportNumber) {
        reportDAO.remove(reportNumber);
    }

    @Override
    public int getTotalTodayReview() {
        return reviewDAO.getTotalToday();
    }

    @Override
    public int getTotalTodayReport() {
        return reportDAO.getTotalToday();
    }

    @Override
    public Long getReviewChart(String date) {
        return reviewDAO.getReviewChart(date);
    }

    @Override
    public Long getReportChart(String date) {
        return reportDAO.getReviewChart(date);
    }
}