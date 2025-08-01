import axios from 'axios';

const axiosInstance = axios.create({
    baseURL: 'https://task-board-backend-only.onrender.com',
    headers: {
        'Content-Type': 'application/json',

    },
});



export default axiosInstance;
