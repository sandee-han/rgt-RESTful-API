# RGT RESTFUL API 과제

### 해당 과제 POSTMAN Documentation
[Postman documentation](https://documenter.getpostman.com/view/25019126/2s946k7r4Y)

### 1. POST 후 DB에 Insert
![POST postman](https://github.com/sandee-han/rgt-google-oauth/assets/69177351/1fb63a7e-7b27-4571-8a6b-cd094c4508ba)
![POST DB result](https://github.com/sandee-han/rgt-google-oauth/assets/69177351/f79ef95c-20ed-4517-9b01-1886b563c3c0)<br>
postman 에서 post 후 DB에 데이터 insert  

<br>

### 2.1 데이터 중복처리
![DB before DELETE](https://github.com/sandee-han/rgt-google-oauth/assets/69177351/1084d97b-a944-4894-a10f-e4de9763857a)<br>
중복데이터 처리 전 DB  

<br>

![delete query](https://github.com/sandee-han/rgt-google-oauth/assets/69177351/24d1acfe-d8a1-4133-a975-f3bdb55da6d1)
![delete duplicate data](https://github.com/sandee-han/rgt-google-oauth/assets/69177351/e18b189f-3c9d-471d-8f86-268829710884)
![delete response](https://github.com/sandee-han/rgt-google-oauth/assets/69177351/1fdc7fa9-a7ab-48df-a862-08fe2fb842b8)<br>
order_id 중복 데이터 1건만 남기고 나머지 데이터 Delete  

<br>

### 2.2 데이터 수정
![DB before put cafelatte](https://github.com/sandee-han/rgt-google-oauth/assets/69177351/f6855a88-7319-4fdf-a5aa-051412a2d155) 
데이터 수정 전 DB  

<br>

![put query](https://github.com/sandee-han/rgt-google-oauth/assets/69177351/6d9edd1e-c2ff-4cca-8f5a-a60980b43d99)
![put teria to latte](https://github.com/sandee-han/rgt-google-oauth/assets/69177351/3c2d7db4-9996-403d-801c-e71ac0c80559)<br>
쿼리를 통한 카페테리아 데이터 전부 카페라떼로 수정
