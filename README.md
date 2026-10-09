<div align="center">

# 설홍원 · Hongwon Seol

### Android Developer · 9년 8개월

**하드웨어와 맞물리는 Android 앱을 양산하고, 출시 후까지 운영합니다.**<br>
차량 내비게이션 → 웨어러블 로봇 → 제조로봇. 현장의 예외 상황을 화면과 규칙으로 정리하는 일을 해 왔습니다.

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/%ED%99%8D%EC%9B%90-%EC%84%A4-b47a171b5/)
[![Email](https://img.shields.io/badge/mhmh2090@gmail.com-EA4335?style=for-the-badge&logo=gmail&logoColor=white)](mailto:mhmh2090@gmail.com)

</div>

## ⚡ At a glance

- 🚗 **현대모비스 6년**: 현대·기아 차량용 Android 내비게이션 업데이트 앱 양산. OTA 솔루션 교체(Redbend → LG전자) 및 유럽 사이버보안 법규(UNECE) 대응
- 🤖 **삼성전자 3년 8개월**: 웨어러블 로봇 앱 Samsung BotFit (Play B2B 배포, B2B 모델 2종 양산), LLM 코칭 과제 리드. 현재 제조로봇 제어 TP Android 앱 개발
- 📱 **개인 앱 2종**: 러닝 앱 부지런, 뉴스 영어 앱 EnglishBite (Google Play 비공개 테스트). 기획부터 서버, 배포까지 1인 개발

## 📌 Projects

<table>
<tr>
<td width="50%" valign="top">

### [🏃 부지런 · Bujirun](https://github.com/hwseol/bujirun)
워치 없이 폰과 이어폰만으로 달리는 러닝 앱

<a href="https://github.com/hwseol/bujirun"><img src="https://raw.githubusercontent.com/hwseol/bujirun/main/docs/images/home.jpg" width="48%"> <img src="https://raw.githubusercontent.com/hwseol/bujirun/main/docs/images/course-run.jpg" width="48%"></a>

- 화면이 꺼져도 정확한 GPS 기록 (Foreground Service, 좌표 필터)
- 갈림길 자동 탐지와 음성 길안내, 내 주변 순환 코스 추천
- 판단 로직을 순수 Kotlin으로 분리, 테스트 93개

`Kotlin` `Compose` `Room` `NAVER Maps` `Health Connect` `FastAPI`

</td>
<td width="50%" valign="top">

### [📰 EnglishBite](https://github.com/hwseol/english_bite)
실제 해외 뉴스 영상으로 배우는 직장인 영어 앱

<a href="https://github.com/hwseol/english_bite"><img src="https://raw.githubusercontent.com/hwseol/english_bite/main/docs/images/catalog.jpg" width="48%"> <img src="https://raw.githubusercontent.com/hwseol/english_bite/main/docs/images/study.jpg" width="48%"></a>

- 단어별 하이라이트 자막, 문장 반복, 관용어 해설
- Whisper·NLLB·Gemma 3 처리 파이프라인 자동화 (3시간 주기)
- 원격 설정, 강제 업데이트, 크래시 리포트로 테스터 운영

`Kotlin` `Compose` `MVVM` `FastAPI` `Whisper` `Ollama`

</td>
</tr>
</table>

## 💼 Experience

| 기간 | 소속 | 주요 업무 |
|---|---|---|
| 2025.10 ~ | **삼성전자** 생산기술연구소 제조로봇팀 | 제조로봇 TP Android 앱(네이티브 + WebView), C++ Drogon REST API·ROS2 연동, Svelte 웹 패널, 사내 AI 개발 도구 |
| 2023.01 ~ 2025.09 | **삼성전자** Samsung Research · 신사업팀 | Samsung BotFit: 삼성헬스 연동, 운동 결과 그래프·GPS, 실내 운동, TTS 코칭, LLM 코칭 과제 리드 |
| 2017.01 ~ 2022.12 | **현대모비스** 내비게이션 개발팀 · OTA 플랫폼셀 | 5세대 와이드 내비게이션 업데이트 앱, OTA 솔루션 교체·UNECE 대응, 통합제어기 무선 업데이트 GUI |

## 🛠 Tech Stack

**Android**<br>
![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=flat-square&logo=kotlin&logoColor=white)
![Java](https://img.shields.io/badge/Java-007396?style=flat-square&logo=openjdk&logoColor=white)
![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-4285F4?style=flat-square&logo=jetpackcompose&logoColor=white)
![Coroutines](https://img.shields.io/badge/Coroutines%20·%20Flow-7F52FF?style=flat-square&logo=kotlin&logoColor=white)
![Hilt](https://img.shields.io/badge/Hilt-34A853?style=flat-square&logo=android&logoColor=white)
![Room](https://img.shields.io/badge/Room-3DDC84?style=flat-square&logo=android&logoColor=white)
![Retrofit](https://img.shields.io/badge/Retrofit-48B983?style=flat-square&logo=square&logoColor=white)

**Backend · AI**<br>
![Python](https://img.shields.io/badge/Python-3776AB?style=flat-square&logo=python&logoColor=white)
![FastAPI](https://img.shields.io/badge/FastAPI-009688?style=flat-square&logo=fastapi&logoColor=white)
![C++](https://img.shields.io/badge/C++-00599C?style=flat-square&logo=cplusplus&logoColor=white)
![AWS](https://img.shields.io/badge/AWS-232F3E?style=flat-square&logo=amazonwebservices&logoColor=white)
![Gemini](https://img.shields.io/badge/Gemini-8E75B2?style=flat-square&logo=googlegemini&logoColor=white)
![Ollama](https://img.shields.io/badge/Ollama-000000?style=flat-square&logo=ollama&logoColor=white)

**Tools**<br>
![Git](https://img.shields.io/badge/Git-F05032?style=flat-square&logo=git&logoColor=white)
![Jira](https://img.shields.io/badge/Jira-0052CC?style=flat-square&logo=jira&logoColor=white)
![Android Studio](https://img.shields.io/badge/Android%20Studio-3DDC84?style=flat-square&logo=androidstudio&logoColor=white)

<sub>🎓 고려대학교 컴퓨터학과 학사</sub>
