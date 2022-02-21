package jp.co.favoriteanime.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.favoriteanime.entity.Anime;

/**
 * アニメ画面を制御するController
 * 
 *@author yoko
 */
 @Controller //DIにControllerとして登録
public class AnimeController {
	 
	 @RequestMapping("/list")   //ブラウザから/listにアクセスする時に
	 public String list(Model model) {     //この処理（listと言う画面を返す）をやってねの意味
		 List<Anime> animes = new ArrayList<Anime>();	//なにかしらデータベースから取ってきたよ。中身にはAnimeクラスが入っている想定
		
		 Anime tensura = new Anime(1, "転すら", "すらいむ");  //コンストラクタ（１行に情報をまとめて渡せるように）
		 Anime kimetsu = new Anime(2, "鬼滅の刃", "鬼出る"); //newはインスタンス化の命令ですよ
		 
		 animes.add(tensura);  //tensuraというインスタンスを入れた
		 animes.add(kimetsu);  //kimetsuというインスタンスを入れた
		 
		 model.addAttribute("animes", animes); //thymeleafに渡す
		 
		 return "list";  
	}

}
