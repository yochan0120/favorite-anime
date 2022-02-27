package jp.co.favoriteanime.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.favoriteanime.entity.Anime;
import jp.co.favoriteanime.mapper.AnimeMapper;

@Service   //ServiceとしてDIに登録
public class AnimeService {
	
	@Autowired
	AnimeMapper mapper;

	public List<Anime> getAnimeList() {
		return mapper.selectAll();  //animeMapperとしてselectAllした結果を返したい

	}
}
