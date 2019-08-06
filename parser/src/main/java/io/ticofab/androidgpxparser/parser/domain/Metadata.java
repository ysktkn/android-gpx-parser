package io.ticofab.androidgpxparser.parser.domain;


import java.time.LocalDateTime;

public class Metadata {

    private final String mName;
    private final String mDesc;
    private final Author mAuthor;
    private final Copyright mCopyright;
    private final Link mLink;
    private final LocalDateTime mTime;
    private final String mKeywords;
    private final Bounds mBounds;
    private final String mExtensions;

    private Metadata(Metadata.Builder builder) {
        mName = builder.mName;
        mDesc = builder.mDesc;
        mAuthor = builder.mAuthor;
        mCopyright = builder.mCopyright;
        mLink = builder.mLink;
        mTime = builder.mTime;
        mKeywords = builder.mKeywords;
        mBounds = builder.mBounds;
        mExtensions = builder.mExtensions;
    }

    public String getName() {
        return mName;
    }

    public String getDesc() {
        return mDesc;
    }

    public Author getAuthor() {
        return mAuthor;
    }

    public Copyright getCopyright() {
        return mCopyright;
    }

    public Link getLink() {
        return mLink;
    }

    public LocalDateTime getTime() {
        return mTime;
    }

    public String getKeywords() {
        return mKeywords;
    }

    public Bounds getBounds() {
        return mBounds;
    }

    public String getExtensions() {
        return mExtensions;
    }

    public static class Builder {
        private String mName;
        private String mDesc;
        private Author mAuthor;
        private Copyright mCopyright;
        private Link mLink;
        private LocalDateTime mTime;
        private String mKeywords;
        private Bounds mBounds;
        private String mExtensions;

        public Builder setName(String mName) {
            this.mName = mName;
            return this;
        }

        public Builder setDesc(String mDesc) {
            this.mDesc = mDesc;
            return this;
        }

        public Builder setAuthor(Author mAuthor) {
            this.mAuthor = mAuthor;
            return this;
        }

        public Builder setCopyright(Copyright mCopyright) {
            this.mCopyright = mCopyright;
            return this;
        }

        public Builder setLink(Link mLink) {
            this.mLink = mLink;
            return this;
        }

        public Builder setTime(LocalDateTime mTime) {
            this.mTime = mTime;
            return this;
        }

        public Builder setKeywords(String mKeywords) {
            this.mKeywords = mKeywords;
            return this;
        }

        public Builder setBounds(Bounds mBounds) {
            this.mBounds = mBounds;
            return this;
        }

        public Builder setExtensions(String mExtensions) {
            this.mExtensions = mExtensions;
            return this;
        }

        public Metadata build() {
            return new Metadata(this);
        }


    }
}
