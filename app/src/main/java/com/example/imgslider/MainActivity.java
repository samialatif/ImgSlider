package com.example.imgslider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.Activity;
import android.os.Bundle;
import android.renderscript.ScriptGroup;

import com.example.imgslider.databinding.ActivityMainBinding;

import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());




        binding.carousel.addData(new CarouselItem("https://img.freepik.com/free-photo/top-view-pepperoni-pizza-with-mushroom-sausages-bell-pepper-olive-corn-black-wooden_141793-2158.jpg?w=2000","Pizza"));
        binding.carousel.addData(new CarouselItem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSpaZss0K2SWvgcKVA5twCBWY5tMjDxG9erlw&usqp=CAU","Burger"));
        binding.carousel.addData(new CarouselItem("https://cdn.loveandlemons.com/wp-content/uploads/2021/01/cheese-fries.jpg","Fries"));
        binding.carousel.addData(new CarouselItem("https://www.licious.in/blog/wp-content/uploads/2020/12/Hyderabadi-chicken-Biryani.jpg","Chicken Biryani"));
        binding.carousel.addData(new CarouselItem("https://thecafesucrefarine.com/wp-content/uploads/Peruvian-Grilled-Chicken-Skewers-4-2.jpg","Grilled Chicken"));
        binding.carousel.addData(new CarouselItem("https://static8.depositphotos.com/1480128/967/i/950/depositphotos_9676918-stock-photo-fried-carp.jpg","Fish"));

    }
}
