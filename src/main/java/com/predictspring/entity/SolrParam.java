package com.predictspring.entity;

/**
 * SolrParam class from received data from api which can use in query by solr
 */
public class SolrParam {
    private String q;
    private String fq;
    private String sort;
    private int start;
    private int row;
    private String fl;
    private String df;
    private boolean highlight;
    private String highlightField;
    private String highlightSimplePost;
    private String hightlightSimplePre;

    public SolrParam(String q, String fq, String sort, int start, int row, String fl, String df, boolean highlight, String highlightField, String highlightSimplePost, String hightlightSimplePre) {
        this.q = q;
        this.fq = fq;
        this.sort = sort;
        this.start = start;
        this.row = row;
        this.fl = fl;
        this.df = df;
        this.highlight = highlight;
        this.highlightField = highlightField;
        this.highlightSimplePost = highlightSimplePost;
        this.hightlightSimplePre = hightlightSimplePre;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public String getFq() {
        return fq;
    }

    public void setFq(String fq) {
        this.fq = fq;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public String getFl() {
        return fl;
    }

    public void setFl(String fl) {
        this.fl = fl;
    }

    public String getDf() {
        return df;
    }

    public void setDf(String df) {
        this.df = df;
    }

    public boolean isHighlight() {
        return highlight;
    }

    public void setHighlight(boolean highlight) {
        this.highlight = highlight;
    }

    public String getHighlightField() {
        return highlightField;
    }

    public void setHighlightField(String highlightField) {
        this.highlightField = highlightField;
    }

    public String getHighlightSimplePost() {
        return highlightSimplePost;
    }

    public void setHighlightSimplePost(String highlightSimplePost) {
        this.highlightSimplePost = highlightSimplePost;
    }

    public String getHightlightSimplePre() {
        return hightlightSimplePre;
    }

    public void setHightlightSimplePre(String hightlightSimplePre) {
        this.hightlightSimplePre = hightlightSimplePre;
    }

    @Override
    public String toString() {
        return "SolrParam{" +
                "q='" + q + '\'' +
                ", fq='" + fq + '\'' +
                ", sort='" + sort + '\'' +
                ", start=" + start +
                ", row=" + row +
                ", fl='" + fl + '\'' +
                ", df='" + df + '\'' +
                ", highlight=" + highlight +
                ", highlightField='" + highlightField + '\'' +
                ", highlightSimplePost='" + highlightSimplePost + '\'' +
                ", hightlightSimplePre='" + hightlightSimplePre + '\'' +
                '}';
    }
}
