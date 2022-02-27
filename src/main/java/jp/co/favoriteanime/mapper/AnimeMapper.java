package jp.co.favoriteanime.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.co.favoriteanime.entity.Anime;

@Mapper  //Mapperとして登録
public interface AnimeMapper {    //データベースにアクセスするためのメソッド
	                              //クラスには処理を書くが、インターフェースには書かない
	public List<Anime> selectAll();    //データベースにアクセスするためのメソッド（selectAllで全権取る
}
