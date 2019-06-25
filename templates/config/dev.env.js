'use strict'
const merge = require('webpack-merge')
const prodEnv = require('./prod.env')

module.exports = merge(prodEnv, {
  NODE_ENV: '"development"',
  devServer:{
    // contentBase: path.join(__dirname,'/'),
    publicPath: '/',
    host: '0.0.0.0',
    port: 8080,
    proxy: {
      '**': 'http://localhost:8080'
    },
    inline: true,
    hot: true
  }
})
