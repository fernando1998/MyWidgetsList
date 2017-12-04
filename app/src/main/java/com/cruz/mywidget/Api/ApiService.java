package com.cruz.mywidget.Api;

import com.cruz.mywidget.Model.Evento;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by keving on 3/12/2017.
 */

public interface ApiService {

    String API_BASE_URL = "https:///muni-denuncias-fernando19.c9users.io/";

    @GET("api/v1/eventos")
    Call<List<Evento>> getEventos();
}
