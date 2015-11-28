package com.gt.android.nomas.adapters;

import android.graphics.drawable.Drawable;

/**
 * Created by root on 26/11/15.
 */
public class TestCategory {

    private String id;
    private String titulo;
    private String nickName;
    private String denuncia;
    private int avatar;

    public TestCategory(String id, String titulo, String nickName, String denuncia, int avatar) {
        this.id = id;
        this.titulo = titulo;
        this.nickName = nickName;
        this.denuncia = denuncia;
        this.avatar = avatar;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getDenuncia() {
        return denuncia;
    }

    public void setDenuncia(String denuncia) {
        this.denuncia = denuncia;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }
}
