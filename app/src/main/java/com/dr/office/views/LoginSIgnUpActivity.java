package com.dr.office.views;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.dr.office.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginSIgnUpActivity extends AppCompatActivity {

    @BindView(R.id.logo)
    ImageView logo;
    @BindView(R.id.btn_login_form)
    TextView btnLoginForm;
    @BindView(R.id.btn_signup_form)
    TextView btnSignupForm;
    @BindView(R.id.edit_email)
    EditText editEmail;
    @BindView(R.id.edit_password)
    EditText editPassword;
    @BindView(R.id.linear_login)
    LinearLayout linearLogin;
    @BindView(R.id.edit_first_name)
    EditText editFirstName;
    @BindView(R.id.edit_last_name)
    EditText editLastName;
    @BindView(R.id.edit_sign_up_email)
    EditText editSignUpEmail;
    @BindView(R.id.edit_sign_up_password)
    EditText editSignUpPassword;
    @BindView(R.id.edit_sign_up_confirm_password)
    EditText editSignUpConfirmPassword;
    @BindView(R.id.edit_sign_up_street_address)
    EditText editSignUpStreetAddress;
    @BindView(R.id.edit_sign_up_city)
    EditText editSignUpCity;
    @BindView(R.id.edit_sign_up_state)
    EditText editSignUpState;
    @BindView(R.id.edit_sign_up_country)
    EditText editSignUpCountry;
    @BindView(R.id.edit_sign_up_zip)
    EditText editSignUpZip;
    @BindView(R.id.edit_sign_up_phone_number)
    EditText editSignUpPhoneNumber;
    @BindView(R.id.linear_sign_up)
    LinearLayout linearSignUp;
    @BindView(R.id.btn_submit)
    Button btnSubmit;
    @BindView(R.id.txt_forgot_password)
    TextView txtForgotPassword;
    @BindView(R.id.divider)
    View divider;
    @BindView(R.id.divider2)
    View divider2;
    @BindView(R.id.card_email)
    CardView cardEmail;
    @BindView(R.id.card_pass)
    CardView cardPass;
    @BindView(R.id.card_first_name)
    CardView cardFirstName;
    @BindView(R.id.card_last_name)
    CardView cardLastName;
    @BindView(R.id.card_sign_up_email)
    CardView cardSignUpEmail;
    @BindView(R.id.card_sign_up_password)
    CardView cardSignUpPassword;
    @BindView(R.id.card_sign_up_confirm_password)
    CardView cardSignUpConfirmPassword;
    @BindView(R.id.card_sign_up_street_address)
    CardView cardSignUpStreetAddress;
    @BindView(R.id.card_sign_up_city)
    CardView cardSignUpCity;
    @BindView(R.id.card_sign_up_state)
    CardView cardSignUpState;
    @BindView(R.id.card_sign_up_country)
    CardView cardSignUpCountry;
    @BindView(R.id.card_sign_up_zip)
    CardView cardSignUpZip;
    @BindView(R.id.card_sign_up_phone_number)
    CardView cardSignUpPhoneNumber;
    @BindView(R.id.linear_main)
    LinearLayout linearMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_signup);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.btn_submit, R.id.txt_forgot_password, R.id.btn_signup_form, R.id.btn_login_form})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_submit:
                Intent n = new Intent(LoginSIgnUpActivity.this, MainActivity.class);
                n.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(n);
                finish();
                break;
            case R.id.txt_forgot_password:
                Intent intent = new Intent(LoginSIgnUpActivity.this, ForgotPasswordActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                break;
            case R.id.btn_signup_form:
                linearLogin.setVisibility(View.GONE);
                linearSignUp.setVisibility(View.VISIBLE);
                divider.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
                btnLoginForm.setTextColor(getResources().getColor(android.R.color.darker_gray));
                btnSignupForm.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
                divider2.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                break;
            case R.id.btn_login_form:
                linearLogin.setVisibility(View.VISIBLE);
                linearSignUp.setVisibility(View.GONE);
                divider.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                btnLoginForm.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
                btnSignupForm.setTextColor(getResources().getColor(android.R.color.darker_gray));
                divider2.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
                break;
        }
    }

}