--
-- PostgreSQL database dump
--

-- Dumped from database version 17.1 (Debian 17.1-1.pgdg120+1)
-- Dumped by pg_dump version 17.1 (Debian 17.1-1.pgdg120+1)

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET transaction_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- Data for Name: article; Type: TABLE DATA; Schema: public; Owner: admin
--



--
-- Data for Name: comment; Type: TABLE DATA; Schema: public; Owner: admin
--



--
-- Data for Name: tutorial; Type: TABLE DATA; Schema: public; Owner: admin
--

INSERT INTO public.tutorial (id, title, description, publication_date) VALUES (1, 'Tutorial Title', 'Tutorial Description', NULL);
INSERT INTO public.tutorial (id, title, description, publication_date) VALUES (2, 'Tutorial Title', 'Tutorial Description', NULL);
INSERT INTO public.tutorial (id, title, description, publication_date) VALUES (3, 'Tutorial Title', 'Tutorial Description', NULL);
INSERT INTO public.tutorial (id, title, description, publication_date) VALUES (4, 'Tutorial Title', 'Tutorial Description', NULL);
INSERT INTO public.tutorial (id, title, description, publication_date) VALUES (5, 'Tutorial Title', 'Tutorial Description', NULL);
INSERT INTO public.tutorial (id, title, description, publication_date) VALUES (6, 'Tutorial Title', 'Tutorial Description', NULL);
INSERT INTO public.tutorial (id, title, description, publication_date) VALUES (7, 'Tutorial Title', 'Tutorial Description', NULL);
INSERT INTO public.tutorial (id, title, description, publication_date) VALUES (8, 'Tutorial Title', 'Tutorial Description', '2024-11-24');
INSERT INTO public.tutorial (id, title, description, publication_date) VALUES (9, 'Tutorial Title', 'Tutorial Description', '2024-11-24');


--
-- Name: article_id_seq; Type: SEQUENCE SET; Schema: public; Owner: admin
--

SELECT pg_catalog.setval('public.article_id_seq', 1, false);


--
-- Name: comment_id_seq; Type: SEQUENCE SET; Schema: public; Owner: admin
--

SELECT pg_catalog.setval('public.comment_id_seq', 1, false);


--
-- Name: tutorial_id_seq; Type: SEQUENCE SET; Schema: public; Owner: admin
--

SELECT pg_catalog.setval('public.tutorial_id_seq', 9, true);


--
-- PostgreSQL database dump complete
--

