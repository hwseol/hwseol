<div align="center">

# 설홍원 (Hongwon Seol)

**Software Engineer · AI Agent / LLM · Android · 경력 9년 10개월**

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0A66C2?style=flat-square&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/%ED%99%8D%EC%9B%90-%EC%84%A4-b47a171b5/)
[![Email](https://img.shields.io/badge/mhmh2090@gmail.com-EA4335?style=flat-square&logo=gmail&logoColor=white)](mailto:mhmh2090@gmail.com)

</div>

## Summary

- 하드웨어 연동 서비스(차량 인포테인먼트, 웨어러블 로봇, 제조로봇)를 양산·운영해 온 엔지니어. 선행 개발부터 VOC 대응까지 제품 전 주기 수행
- 웨어러블 로봇 BotFit의 LLM 서비스(RAG, 생성 결과 자동 평가·재생성)를 실사용자 대상으로 운영
- Claude Code·Codex CLI 기반 사내 멀티 에이전트 개발 도구를 단독 개발해 배포
- 모델을 목적에 맞게 학습: Gemini 튜닝(Vertex AI), Qwen2.5-7B LoRA, 큰 모델로 만든 데이터를 94KB 온디바이스 모델로 증류. 평가셋과 출시 기준을 먼저 정하고 지표로 개선

## Model Training & Evaluation

| 기법 | 프로젝트 | 내용 |
|---|---|---|
| 증류 (Distillation) | [부지런](https://github.com/hwseol/bujirun/blob/main/docs/NL_COURSES.md) | Gemini로 학습 문장 약 1만 건과 정답 꼬리표 생성 → 글자·자모 임베딩 + BiGRU 94KB 모델(int8). 폰 안에서 순수 Kotlin으로 추론, 운영 중 LLM 호출 0건 |
| LoRA 튜닝 | 사내 코드 생성 도구 | Qwen2.5-7B에 사내 디자인 가이드·표준 샘플코드 스타일 학습, 로컬 서빙. 자주 바뀌는 규격은 RAG로 분리 |
| 지도 학습 튜닝 | BotFit | Vertex AI에서 Gemini를 약 1,000건으로 튜닝, 튜닝 모델을 생성 결과의 스타일 평가자로도 활용 |
| 평가 설계 | 부지런 · BotFit | 학습과 분리된 평가셋 500건(100건 사람 검수), 완전일치 95% 출시 기준 / TF-IDF·임베딩 유사도·BLEU·ROUGE·자카드 비교로 생성 품질 점수식 설계 |

## Experience

### 삼성전자 · 2023.01 ~ 재직 중 · 과장

**생산기술연구소 제조로봇팀** (2025.10 ~ 현재)
- 사내 AI 개발 에이전트(VS Code Extension, 단독 개발): 이슈·PR 기반 분석·구현·테스트·리뷰 멀티 에이전트, 모든 에이전트가 승인해야 종료. Claude Code·Codex CLI 실행 엔진, GitHub MCP 연동
- 사내 디자인 가이드 준수 코드 생성 도구: LangGraph Multi-Agent, FAISS RAG, Qwen2.5-7B LoRA
- 제조로봇 제어 TP(티칭 펜던트) Android 앱 개발 및 유지보수 (Android 네이티브 + WebView)
- 앱·웹 패널 공용 C++(Drogon) REST API 개발, ROS2 로봇 제어부 통신 구조 구현
- Svelte·Tailwind 기반 로봇 제어 웹 패널 개발, GitHub Actions CI

**Samsung Research Robot Center · 신사업팀** (2023.01 ~ 2025.09)
- 웨어러블 로봇 앱 Samsung BotFit 개발 (Play 스토어 B2B 배포, B2B 모델 2종 양산)
- LLM 기반 운동 추천·코칭 고도화 과제 리드: 요청 분석 → RAG 검색 → 생성 → 평가 → 선택, 기준 미달 시 재생성·기본 문구 대체
- 공개 임상데이터·산학 논문 RAG (Bedrock 임베딩, MongoDB 벡터DB, TF-IDF·코사인 하이브리드 검색)
- 삼성헬스 연동, 운동 결과 그래프·GPS 경로, 실내 운동, TTS 코칭 담당
- 비정제 운동 데이터(GPS 음영, 블루투스 끊김, 통화 중단)의 표시 규칙 정의 및 결과 화면 구현

### 현대모비스 · 2017.01 ~ 2022.12 · 대리

**내비게이션 개발팀 · OTA 플랫폼셀**
- 현대·기아 5세대 와이드 Android 내비게이션 업데이트 앱 개발 (Java, C)
- OTA 솔루션 교체(Redbend → LG전자 SCOMO) 및 유럽 사이버보안 법규(UNECE) 대응
- 통합제어기(CCU) 무선 업데이트 GUI 개발, 차량 상태별 팝업 20여 종 분기
- USB 업데이트 사전 유효성 검사 도입으로 업데이트 실패 VOC 감소

## Projects

<table>
<tr>
<td width="50%" valign="top">

**[부지런 (Bujirun)](https://github.com/hwseol/bujirun)**<br>
<sub>러닝·걷기 기록, 음성 길안내, 말로 코스 만들기</sub>

<a href="https://github.com/hwseol/bujirun"><img src="https://raw.githubusercontent.com/hwseol/bujirun/main/docs/images/home.jpg" width="48%"> <img src="https://raw.githubusercontent.com/hwseol/bujirun/main/docs/images/course-run.jpg" width="48%"></a>

- "한강 따라 5km" → 94KB 온디바이스 모델로 증류한 해석기 + 서버 코스 플래너 ([설계](https://github.com/hwseol/bujirun/blob/main/docs/NL_COURSES.md))
- Foreground Service 기반 GPS 기록, 갈림길 자동 탐지 음성 길안내, 순환 코스 추천
- 핵심 로직 순수 Kotlin 분리, 단위 테스트 93개

<sub>Kotlin · Jetpack Compose · Room · NAVER Maps · Health Connect · FastAPI · PyTorch</sub>

</td>
<td width="50%" valign="top">

**[EnglishBite](https://github.com/hwseol/english_bite)**<br>
<sub>해외 뉴스 영상 기반 영어 학습 앱 (2026.10 Google Play 출시)</sub>

<a href="https://github.com/hwseol/english_bite"><img src="https://raw.githubusercontent.com/hwseol/english_bite/main/docs/images/catalog.jpg" width="48%"> <img src="https://raw.githubusercontent.com/hwseol/english_bite/main/docs/images/study.jpg" width="48%"></a>

- 단어별 하이라이트 자막, 문장 단위 반복, 관용어 해설
- yt-dlp → Whisper(Groq) → LLM 번역·해설 자동 파이프라인, 여러 LLM을 묶은 라우터로 가중 배분·폴백
- 로컬 모델로 하루 약 60개 처리량을 못 맞춰 API 방식으로 전환
- 원격 설정, 강제 업데이트, 크래시 리포트 기반 운영

<sub>Kotlin · Jetpack Compose · MVVM · FastAPI · Whisper · AWS EC2</sub>

</td>
</tr>
</table>

## Skills

| 분야 | 기술 |
|---|---|
| AI Agent | Claude Code, Codex CLI, 멀티 에이전트 오케스트레이션, MCP, LangGraph, LangChain |
| 모델 학습·평가 | LoRA(Qwen2.5-7B), Vertex AI 튜닝(Gemini), 증류·int8 양자화(PyTorch → Kotlin), 평가셋 설계, BLEU·ROUGE·임베딩 유사도 |
| RAG·서빙 | FAISS, MongoDB 벡터DB, Bedrock 임베딩, 하이브리드 검색, LLM 라우팅·폴백 |
| Android | Kotlin, Java, Jetpack Compose, XML View, Coroutines/Flow, Hilt, Room, Retrofit, MVVM, Foreground Service |
| 플랫폼·임베디드 | Android 플랫폼 앱, 리커버리 모드(C), OMA-DM, CAN 진단 통신 |
| 서버·기타 | Python(FastAPI), C++(Drogon), ROS2, Svelte, Vue.js, AWS, GitHub Actions |
| 협업 | Git, Jira, Confluence |

## Education

- 고려대학교 컴퓨터학과 학사 (2010.03 ~ 2017.02)
