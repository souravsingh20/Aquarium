package com.app.shopping;


import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class AdminCategoryActivity extends AppCompatActivity {
//    private ImageView tShirts, sportsTShirts, femaleDresses, sweathers;
    private ImageView fashion, groceries, medicines;
    private ImageView glasses, electronics, snacksAndBeverage;
    private ImageView food, homeDecor, others;
    private Button LogoutBtn, CheckOrdersBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        LogoutBtn = (Button) findViewById(R.id.admin_logout_btn);
        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AdminCategoryActivity.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });
        CheckOrdersBtn = (Button) findViewById(R.id.check_orders_btn);


        CheckOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AdminCategoryActivity.this,AdminNewOrdersActivity.class);
                startActivity(intent);
            }
        });



        fashion = (ImageView) findViewById(R.id.t_shirts);
        groceries = (ImageView) findViewById(R.id.sports_t_shirts);
        medicines = (ImageView) findViewById(R.id.female_dresses);
//        sweathers = (ImageView) findViewById(R.id.sweathers);

        glasses = (ImageView) findViewById(R.id.glasses);
        electronics = (ImageView) findViewById(R.id.hats_caps);
        snacksAndBeverage = (ImageView) findViewById(R.id.purses_bags_wallets);
//        shoes = (ImageView) findViewById(R.id.shoes);

        food = (ImageView) findViewById(R.id.headphones_handfree);
        homeDecor = (ImageView) findViewById(R.id.laptop_pc);
        others = (ImageView) findViewById(R.id.watches);
//        mobilePhones = (ImageView) findViewById(R.id.mobilephones);


        fashion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Fashion");
                startActivity(intent);
            }
        });
        groceries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Groceries");
                startActivity(intent);
            }
        });


        medicines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Medicines");
                startActivity(intent);
            }
        });


//        sweathers.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view)
//            {
//                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
//                intent.putExtra("category", "Sweathers");
//                startActivity(intent);
//            }
//        });


        glasses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Glasses");
                startActivity(intent);
            }
        });


        electronics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Electronics");
                startActivity(intent);
            }
        });



        snacksAndBeverage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Snacks and Beverages");
                startActivity(intent);
            }
        });


//        shoes.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view)
//            {
//                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
//                intent.putExtra("category", "Shoes");
//                startActivity(intent);
//            }
//        });



        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Food");
                startActivity(intent);
            }
        });


        homeDecor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Home Decor");
                startActivity(intent);
            }
        });


        others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Others");
                startActivity(intent);
            }
        });


//        mobilePhones.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view)
//            {
//                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
//                intent.putExtra("category", "Mobile Phones");
//                startActivity(intent);
//            }
//        });
    }
}
