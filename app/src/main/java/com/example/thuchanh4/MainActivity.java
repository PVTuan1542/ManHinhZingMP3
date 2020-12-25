package com.example.thuchanh4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init_muonnghe();
        init_playlist();
        init_radio();
        init_zingchart();
    }

    //Adapter rcv
    public  void init_muonnghe(){

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rcv_muonnghe);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        ArrayList<list> arrayList =  new ArrayList<>();

        arrayList.add(new list(R.drawable.vpop_cover,"Cover Việt ngày nay"));
        arrayList.add(new list(R.drawable.vpop_nhac_han,"Nhac phim Hàn Quốc tuổi học trò"));
        arrayList.add(new list(R.drawable.vpop_nhac_hoa,"Nhac Hoa Hót Trên Mạng Xã Hội"));
        arrayList.add(new list(R.drawable.vpop_rap,"Thức dậy ráp thôi"));
        arrayList.add(new list(R.drawable.vpop_thang_moi,"V-Pop tháng 11 có gì hót"));
        arrayList.add(new list(R.drawable.vpop_tiem_nang,"Tiềm Năng V-Pop"));


        AdapterList adapter = new AdapterList(arrayList,getApplicationContext(),R.layout.row_item);
        recyclerView.setAdapter(adapter);

    }
    public  void init_playlist(){

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rcv_playlist);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        ArrayList<list> arrayList =  new ArrayList<>();

        arrayList.add(new list(R.drawable.play_con_tim_hay_li_tri,"Chọn con tim hay lý trí"));
        arrayList.add(new list(R.drawable.play_em_van_on,"Em vẫn ổn,chỉ là rất nhớ anh"));
        arrayList.add(new list(R.drawable.play_ko_the_cung_nhau,"Không thể cùng nhau"));
        arrayList.add(new list(R.drawable.play_nhac_trung,"Nhac Trung"));
        arrayList.add(new list(R.drawable.play_nghe_nhieu_nhat,"Nhac nghe nhiều nhất"));
        arrayList.add(new list(R.drawable.play_motivation,"Motivation Mix"));


        AdapterList adapter = new AdapterList(arrayList,getApplicationContext(),R.layout.row_item);
        recyclerView.setAdapter(adapter);

    }
    public  void init_radio(){

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rcv_radio);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        ArrayList<list> arrayList =  new ArrayList<>();

        arrayList.add(new list(R.drawable.radio_apj,"APJ"));
        arrayList.add(new list(R.drawable.radio_blackpink,"Blackpink"));
        arrayList.add(new list(R.drawable.radio_cu_voi_vang,"Cứ vội vàng"));
        arrayList.add(new list(R.drawable.radio_danh_mat_em,"Đánh mất em"));
        arrayList.add(new list(R.drawable.radio_em_be,"Em bé"));
        arrayList.add(new list(R.drawable.radio_keo_bong_gon,"Kẻo bông gòn"));


        AdapterList adapter = new AdapterList(arrayList,getApplicationContext(),R.layout.row_item);
        recyclerView.setAdapter(adapter);

    }
    public  void init_zingchart(){

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rcv_zingchart);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        ArrayList<zingchart> arrayList =  new ArrayList<>();

        arrayList.add(new zingchart(1,"Yêu Một Người Sao Buồn Đến Thế","Noo Phước Thịnh",R.drawable.top_one));
        arrayList.add(new zingchart(2,"Thiên Đàng ","Wowy,JoliPoli",R.drawable.top_thiengdang));
        arrayList.add(new zingchart(3,"Hoa Hải Đường","Jack",R.drawable.top_hoa_hai_duong));
        arrayList.add(new zingchart(4,"Kết Thúc Lưng Chừng","Văn Võ Ngọc Nhân",R.drawable.top_ket_thuc_lung_chung));
        arrayList.add(new zingchart(5,"Anh Mệt Rồi","Anh Quân Idol",R.drawable.top_anhmetroi));
        arrayList.add(new zingchart(6,"Cuộc Gọi Nhỡ","Vương Anh Tú",R.drawable.top_cuoc_goi_nho));
        arrayList.add(new zingchart(7,"Sao em lại tắt máy?","Phạm Nguyê ngọc,Vanh,B",R.drawable.top_saoanhlaiboem));
        arrayList.add(new zingchart(8,"Hanh phúc bỏ rơi em","Hương Ly",R.drawable.top_hanhphucboroiem));
        arrayList.add(new zingchart(9,"Hoa khúc tương tư","Minh Vương M4U",R.drawable.top_hoakhuctuongtu));
        arrayList.add(new zingchart(10,"Bức bình phong","Trịnh Thăng Bình",R.drawable.top_bucbinhphong));
        arrayList.add(new zingchart(11,"Anh từng cố gắng","Nhật Phong",R.drawable.top_anhtungcogang));


        AdapterZingchart adapter = new AdapterZingchart(arrayList,getApplicationContext(),R.layout.row_zingchart);
        recyclerView.setAdapter(adapter);

    }

}