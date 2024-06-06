const express = require('express');
const axios = require('axios');
const cors = require('cors');

const app = express();
const port = 3000;

app.use(cors({ origin: 'http://localhost:3001' }));
app.use(express.json());

app.post('/processFolio', async (req, res) => {
    try {
        const { folio } = req.body;
        const response = await axios.post('http://localhost:8080/processFolio', { folio });

        res.json(response.data);
    } catch (error) {
        console.error('Error processing folio:', error);
        
        res.status(500).json({ error: 'Error processing folio' });
    }
});

app.listen(port, () => {
    console.log(`Node.js server listening on port ${port}`);
});
